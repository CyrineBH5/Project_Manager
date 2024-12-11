package org.example;

import java.util.Date;

public class Project {
        private int id;
        private String libelle;
        private Date dateDebut;
        private Date dateFin;
        private int totalTasks;
        private double cost;
        public Project(int id, String libelle, Date dateDebut, Date dateFin, int totalTasks, double cost) {
            this.id = id;
            this.libelle = libelle;
            this.dateDebut = dateDebut;
            this.dateFin = dateFin;
            this.totalTasks = totalTasks;
            this.cost = cost;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLibelle() {
            return libelle;
        }

        public void setLibelle(String libelle) {
            this.libelle = libelle;
        }

        public Date getDateDebut() {
            return dateDebut;
        }

        public void setDateDebut(Date dateDebut) {
            this.dateDebut = dateDebut;
        }

        public Date getDateFin() {
            return dateFin;
        }

        public void setDateFin(Date dateFin) {
            this.dateFin = dateFin;
        }

        public int getTotalTasks() {
            return totalTasks;
        }

        public void setTotalTasks(int totalTasks) {
            this.totalTasks = totalTasks;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

//        public void afficherDetails() {
//            System.out.println("Project ID: " + id);
//            System.out.println("Libelle: " + libelle);
//            System.out.println("Date de Début: " + dateDebut);
//            System.out.println("Date de Fin: " + dateFin);
//            System.out.println("Nombre total de tâches: " + totalTasks);
//            System.out.println("Coût estimé: " + cost + "€");
//        }
    }

