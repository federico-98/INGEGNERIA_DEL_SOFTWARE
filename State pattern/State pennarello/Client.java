public class Client {
    public static void main(String[] args) {
        Pennarello p = new Pennarello();
        p.showColor(); // il pennarello è chiuso inizialmente
        p.setColor(new Red());
        p.showColor();
        p.setColor(new Green());
        p.showColor();
        p.setColor(new Close());  // chiudo il pennarello adesso che ho finito
        p.showColor();

    }
}
