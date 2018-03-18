package Model;

import java.util.ArrayList;

public abstract class Skill {

    private String Name;
    private String Description;
    private Level ReqLvl;

    Skill(){
        Name = "Dummy";
        Description = "Insert Dummy Here";
        ReqLvl = new Level();
    }

    public Skill(String name, String description, Level reqLvl) {
        Name = name;
        Description = description;
        ReqLvl = reqLvl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Level getReqLvl() {
        return ReqLvl;
    }

    public void setReqLvl(Level reqLvl) {
        ReqLvl = reqLvl;
    }

    public abstract void ApplySkill();

    public abstract void RemoveSkill();

    public ArrayList<String> getStats() {
        ArrayList<String> stats = new ArrayList<>();
        stats.add("Name: " + Name);
        stats.add("Description: " + Description);
        stats.add("Req Level: " + ReqLvl.getLevel());
        getSpecificStats(stats);
        return stats;
    }

    abstract void getSpecificStats(ArrayList<String> stats);
}
