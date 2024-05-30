public class GameMain14 {
    public static void main(String[] args) {
        ScavengerHunt14 hunt = new ScavengerHunt14();
        System.out.println("=====================Savenger Hunt========================");
        System.out.println("                         [Start]");
        System.out.println("-----------------------------------------------------------");
        hunt.addNode("Apa Ibu Kota dari Negara Perancis?", "Paris");
        hunt.addNode("Siapa penyanyi dari lagu 'High School in Jakarta'?", "Niki");
        hunt.addNode("Siapa Juara Dunia Formula 1 tahun 2023?", "Max Verstappen");
        hunt.addNode("Apa tittle track dari album terbaru Ariana Grande yang terbaru?", "Eternal Sunshine");
        hunt.play();
    }
}