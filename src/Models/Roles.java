/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author josej
 */
public class Roles {
    public int IdRole;
    public String Role;

    public int getIdRole() {
        return IdRole;
    }

    public void setIdRole(int IdRole) {
        this.IdRole = IdRole;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return Role ;
    }
    
    
}
