interface Playable {
    void play();
}
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Играет гитару");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Играет на пианино");
    }
}