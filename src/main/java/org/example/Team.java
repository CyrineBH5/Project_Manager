package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int id;
    private String name;
    private List<String> members;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.members = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void removeMember(String member) {
        members.remove(member);
    }

    // Afficher les informations de l'équipe
    public void afficherDetails() {
        System.out.println("Team ID: " + id);
        System.out.println("Nom de l'équipe: " + name);
        System.out.println("Membres de l'équipe: " + String.join(", ", members));
    }
}
