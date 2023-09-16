public class CalcCake {
    public static void main(String[] args) {
        final String shortcake = "ショートケーキ";
        final int shortcake_price = 320;

        final String montblanc = "モンブラン";
        final int montblanc_price = 350;

        final String chococake = "チョコレートケーキ";
        final int chococake_price = 370;

        final String strawberry = "ストロベリータルト";
        final int strawberry_price = 400;

        final String cheesecake = "チーズケーキ";
        final int cheesecake_price = 300;

        final double discount = 0.8f;
        final double tax = 1.08;

        int total_price = 0;

        for (int i = 0; i < args.length; i += 2) {
            String order_cake = args[i];
            int order_count = Integer.parseInt(args[i + 1]);
            switch (order_cake) {
                case (shortcake):
                    total_price += order_count * shortcake_price;
                    break;
                case (montblanc):
                    total_price += order_count * montblanc_price;
                    break;
                case (chococake):
                    total_price += order_count * chococake_price;
                    break;
                case (strawberry):
                    total_price += order_count * strawberry_price;
                    break;
                case (cheesecake):
                    total_price += order_count * cheesecake_price;
                    break;
            }

        }
        int payment_amount = 0;
        if (total_price > 1000) {
            payment_amount = (int) (total_price * discount * tax);
        } else {    
            payment_amount = (int) (total_price * tax);
        }
        System.out.println("お会計は" + payment_amount + "円です。");
    }

}
