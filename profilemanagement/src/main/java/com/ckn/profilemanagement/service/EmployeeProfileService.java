package com.ckn.profilemanagement.service;

import com.ckn.profilemanagement.domain.EmployeeProfile;
import java.util.List;

public interface EmployeeProfileService {
    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}