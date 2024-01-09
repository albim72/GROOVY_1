enum Color {
    RED,GREEN,YELLOW
}

enum Day {
    PON,WT,SR,CZW,PT,SOB,NDZ,ERR
}

public class Main {
    Day day;

    public Main(Day day) {
        this.day = day;
    }
    public void dziendobry(){
        switch (day){
            case PON:
                System.out.println("Poniedziałek i do pracy...");
                break;
            case WT:
                System.out.println("Wtorek...");
                break;
            case SR:
                System.out.println("Środek tygodnia");
                break;
            case CZW:
                System.out.println("Czwartek pełen pracy");
                break;
            case PT:
                System.out.println("Piątek i blisko weekend");
                break;
            case SOB:
                System.out.println("Czas na podsumowania...");
                break;
            case NDZ:
                System.out.println("Niedziela, odpoczynek");
                break;
            default:
                System.out.println("taki dzień nie istnieje");
                break;

        }
    }

    public static void main(String[] args) {

        Color c1 = Color.GREEN;
        System.out.println(c1);

        String dayofweek = "SOB";
        Main m1 = new Main(Day.valueOf(dayofweek));
        m1.dziendobry();

        Color koltab[] =Color.values();
        for(Color col:koltab){
            System.out.println(col + " przy indeksie " + col.ordinal());
        }


    }
}
