public class Main {

    public static void main(String[] args) {

        int [] measurements = {2, 4, 6};

        Block littleBlock = new Block(measurements);
        Block littleBlock1 = new Block(2, 4, 6);

        System.out.println(littleBlock.getBlockHeight());

        System.out.println(littleBlock.calculateBlockVolume());

    }

}
