public class VarParameterExercise2 {
    public static void main(String[] args) {
            hep hm = new hep();
            System.out.println(hm.showScore("shabi", 50, 60, 70, 90, 90, 90));
        }

    }

    class hep {
        public String showScore(String name, double... score) {
            double totalSacore = 0;
            for (int i = 0; i < score.length; i++) {
                totalSacore += score[i];

            }
            return name + "有" + score.length + "内科的成绩总分为=" + totalSacore;

        }
    }

