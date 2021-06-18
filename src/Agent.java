 class Agent {
    private Agent nextAgent;
    private Buy buy;
    public Agent(Agent aNextAg,Buy aBuy){
nextAgent = aNextAg;
buy = aBuy;
    }

     public Agent getNextAgent() {
         return nextAgent;
     }

     public Buy getBuy() {
         return buy;
     }

     public void setNextAgent(Agent nextAgent) {
         this.nextAgent = nextAgent;
     }

     public void setBuy(Buy buy) {
         this.buy = buy;
     }
 }
