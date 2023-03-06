public class THmyDate {
    int day, month, year;
    public THmyDate(int day, int month, int year){
        this.day= day;
        this.month=month;
        this.year= year;
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public String myDate(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}
