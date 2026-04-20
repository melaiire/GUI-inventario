public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Holi, proyecto( •̀ ω •́ )✧");


        Sistema sys = new Sistema();

        FILEIO file = new FILEIO();

        sys.addDisco();

        file.read();
    }
}
