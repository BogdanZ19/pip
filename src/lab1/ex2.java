package lab1;

public class ex2 {
    public static void main(String[] args) {
        for (int ana = 1; ana <= 5; ana++) {
            if (ana != 5) {
                for (int bianca = 1; bianca <= 5; bianca++) {
                    if (bianca != 1 && bianca != ana) {
                        for (int carmen = 1; carmen <= 5; carmen++) {
                            if (carmen != 1 && carmen != 5 && carmen != ana && carmen != bianca) {
                                int diana = bianca + 1;
                                if (diana > 5) {
                                    continue;
                                }
                                if (diana != ana && diana != bianca && diana != carmen) {
                                    for (int elena = 1; elena <= 5; elena++) {
                                        if ((elena > carmen + 1) || (elena < carmen - 1)) {
                                            System.out.println(
                                                    "Ana: " + ana + " Bianca: " + bianca + " Carmen: " + carmen
                                                            + " Diana: " + diana + " Elena: " + elena);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
