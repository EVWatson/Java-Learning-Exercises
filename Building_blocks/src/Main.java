public class Main {

    public static void main(String[] args) {

        int [] measurements = {2, 4, 6};

        Block littleBlock = new Block(measurements);

        System.out.println(littleBlock.getBlockHeight());

        System.out.println(littleBlock.calculateBlockVolume());

    }

}
