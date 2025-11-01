package exercises;

public class EX2_4 {
    public static void main(String[] args) {
        int n, count = 1, sprice, days, bids, cbids = 1, ammount, sumprice = 0, over10 = 0, maxbid3, maxbid, overdouble, over60 = 0, under100;
        char item, bidder, maxbidder;
        boolean under1000 = true;

        System.out.println("input number of auctions: ");
        n = Console.readInt();

        while (count <= n) {
            System.out.println("input letter of auctioned item(1 uppercase letter): ");
            item = Console.readChar();

            while (Character.isUpperCase(item)) {
                System.out.println("bad name, input name of auctioned item: ");
                item = Console.readChar();
            }

            System.out.println("input Starting price: ");
            sprice = Console.readInt();

            System.out.println("input duration in days: ");
            days = Console.readInt();

            System.out.println("input number of bids: ");
            bids = Console.readInt();

            if (bids > 10) {
                sumprice += sprice;
                over10++;
            }

            maxbid3 = 0;
            maxbid = 0;
            maxbidder = '\0';
            overdouble = 0;
            under100 = 0;

            while (cbids <= bids) {
                System.out.println("input bidder(single letter): ");
                bidder = Console.readChar();

                System.out.println("input bid ammount: ");
                ammount = Console.readChar();

                if (days < 3 && (ammount > maxbid3)) {
                    maxbid3 = ammount;
                }

                if (ammount > maxbid) {
                    maxbidder = bidder;
                    maxbid = ammount;
                }
                if (ammount >= (sprice * 2)) {
                    overdouble++;
                    if (ammount > 1000) {
                        under1000 = false;
                    }
                    if (ammount < 100) {
                        under100++;
                    }

                    cbids++;
                }
                System.out.println("the highest bidder in auction " + count + " is " + maxbidder + " with an ammount of " + maxbid);

                System.out.println("the maximmum bid in auction " + count + " with a duration under 3 days  is " + maxbid3);

                if (under1000 && under100 >= 5) {
                    System.out.println("The item " + item + " has at least 5 bids under 100 and no bids over 1000");
                }


                if (overdouble >= (bids * 0.6)) {
                    over60++;
                }


                count++;
            }
            System.out.println("the average starting price for auctions over 10 bids: " + (sumprice / over10));

            System.out.println(over60 + " Auctions have at least 60% of their bids at twice the starting price");


        }
    }
}
