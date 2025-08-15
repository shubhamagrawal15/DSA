package EnumEg;

public class Basic {
    enum Week{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
        // these are enum constants
        // public,static and final members they are
        // since its final we cant create child enums
        // type is Week



        Week(){
            System.out.println("Constructor called for  "+this);
        }

        // this isn't public or protectted only private or default
        // why? we don't want to create new objects
        // this is nt the enum conecpet

        // internaly : public  static final Week Monday = new Week()



    public static void main(String[] args) {
        Week week;
        week=Week.Monday;

        for(Week day:Week.values()){
            System.out.println(day);
        }

        System.out.println(week);
        System.out.println(week.ordinal());
    }
}
