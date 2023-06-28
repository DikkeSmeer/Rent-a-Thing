package org.example;

public class Employee extends User implements Observer {
    private String role;

    public Employee (String username, String password, String role) {
        super(username, password);
        this.role = role;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void update() {
        // updates the frontend
    }
}
