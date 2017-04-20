package xunshijiance.xunshi.jihuaxunshi.model;

/**
 * Created by DMN on 2017/4/13.
 */

public class Jihua {
    private String Titile;
    private String Person;
    private String DataTime;

    public Jihua() {
    }

    public Jihua(String titile, String person, String dataTime) {
        Titile = titile;
        Person = person;
        DataTime = dataTime;
    }

    public String getTitile() {
        return Titile;
    }

    public void setTitile(String titile) {
        Titile = titile;
    }

    public String getPerson() {
        return Person;
    }

    public void setPerson(String person) {
        Person = person;
    }

    public String getDataTime() {
        return DataTime;
    }

    public void setDataTime(String dataTime) {
        DataTime = dataTime;
    }

    @Override
    public String toString() {
        return "Jihua{" +
                "Titile='" + Titile + '\'' +
                ", Person='" + Person + '\'' +
                ", DataTime='" + DataTime + '\'' +
                '}';
    }
}
