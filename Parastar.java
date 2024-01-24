public class Parastar {
    private String nurse;
    private String password;
    private final String iD;

    public Parastar(String iD, String password) {
        this.password = password;
        this.iD = iD;
    }

    public String getPassword() {
        return password;
    }

    public String getiD() {
        return iD;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public boolean passwordCheck(String passwordChecker) {
        return password.equals(passwordChecker);
    }
}
