public class CompetitionScoringSystem{
    private int[] scores;
    private String playerName;
    
    public void finalResult(){
        int max=scores[0];
        for (int i = 1; i<scores.length; i++){
            if (scores[i]>max){
                max=scores[i];
            }
        }
        int min=scores[0];
        for(int i =0; i<scores.length; i++){
            if(scores[i]<min){
                min=scores[i];
            }
        }
        int sum=0;
        for(int i =0; i<scores.length; i++){
            sum+=scores[i];
        }
        sum-=max;
        sum-=min;
        double mean=sum/3;
        System.out.println("Competitor: " + playerName + " Score: " + mean);
    }
    public CompetitionScoringSystem(int[] scores, String playerName){
        this.scores= scores;
        this.playerName=playerName;
    }
    public static void main(String[] args){
        CompetitionScoringSystem player1 = new CompetitionScoringSystem(new int[]{5,3,2,4,2}, "Jan Kowalski");
        CompetitionScoringSystem player2 = new CompetitionScoringSystem(new int[]{1,2,3,4,5}, "Marek Kowalczyk");
        CompetitionScoringSystem player3 = new CompetitionScoringSystem(new int[]{5,4,3,2,5}, "Piotr Ktoś");
        player1.finalResult();
        player2.finalResult();
        player3.finalResult();
    }
}
