package com.example.prj_oop;

public class WorkspaceSelfSufficiencyData {
    private int year;
    private float workspaceSS;

    public WorkspaceSelfSufficiencyData (int year, float workspaceSS){
        this.year = year;
        this.workspaceSS = workspaceSS;
    }

    public int getYear() {
        return year;
    }

    public float getWorkspaceSS() {
        return workspaceSS;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWorkspaceSS(float workspaceSS) {
        this.workspaceSS = workspaceSS;
    }
}
