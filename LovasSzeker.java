public class LovasSzeker extends Jarmu {

    public void halad(int mennyiseg){
        if (mennyiseg < 5) {
            super.halad(mennyiseg);
        } else {
            super.halad(-1);
        }
    }
}
