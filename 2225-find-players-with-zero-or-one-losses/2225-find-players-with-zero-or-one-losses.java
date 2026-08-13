class Solution {

    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> Winnermap = new HashMap<>();
        Map<Integer, Integer> Lossermap = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int looser = match[1];

            // winner ko winner map me daalo (freq ke sath)
            Winnermap.put(winner, Winnermap.getOrDefault(winner, 0) + 1);
            // loser ko loser map me daalo (freq ke sath)
            Lossermap.put(looser, Lossermap.getOrDefault(looser, 0) + 1);
        }

        // 2 new list banayi he separate
        List<Integer> Winnerlist = new ArrayList<>();
        List<Integer> Looserlist = new ArrayList<>();

        // list me add kar rhe using key set
        for (int player : Winnermap.keySet()) {
            if (!Lossermap.containsKey(player)) {
                Winnerlist.add(player);
            }
        }

        // apan ko value bhi dekhna tha or key bhi isliye dono use kiya entry set se
        for (Map.Entry<Integer, Integer> loose : Lossermap.entrySet()) {
            if (loose.getValue() == 1) {
                Looserlist.add(loose.getKey());
            }
        }

        Collections.sort(Winnerlist);
        Collections.sort(Looserlist);

        // dono list ko add kar diya.   
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Winnerlist);
        answer.add(Looserlist);

        return answer;

    }

}