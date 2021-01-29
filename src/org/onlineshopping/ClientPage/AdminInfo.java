package org.onlineshopping.ClientPage;

public class AdminInfo {

    private String adminId, adminPw, adminName;
    private static AdminInfo adminInfo = new AdminInfo();

    private AdminInfo() {
        adminId = "00XX000";
        adminPw = "000000";
    }

    public AdminInfo getAdmin() {
        return adminInfo;
    }

    public String getAdmin_Name() {
        return adminName;
    }

    public void setAdmin_Name(String admin_Name) {
        adminName = admin_Name;
    }

    public String getAdmin_Password() {
        return adminPw;
    }

    public void setAdmin_Password(String admin_Password) {
        adminPw = admin_Password;
    }

}
