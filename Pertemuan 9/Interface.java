interface MakhlukHidup {
    public void bernafas();
    public void bernama(String nama);
}

interface Mamalia {
    public void habitat();
}

class Paus implements Mamalia, MakhlukHidup {
    
    @Override
    public void bernafas(){
        System.out.println("Bernafas dengan paru-paru");
    }

    @Override
    public void bernama(String nama){
        System.out.println("Bernama: " + nama);
    }

    @Override
    public void habitat(){
        System.out.println("Habitat di laut");
    }
}

public class Interface {
    public static void main(String[] args) {
        Paus paus = new Paus();
        paus.bernama("Paus");
        paus.bernafas();
        paus.habitat();
    }
    
}
