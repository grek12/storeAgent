class Store {
    private Agent firstAgent;
    private String storeName;
    int buyCount;

    public Store(String aName) {
        storeName = aName;
    }

    public Agent getFirstAgent() {
        return firstAgent;
    }

    public void addBuy(String aFam) {
        Buy buy = new Buy(aFam);
        firstAgent = new Agent(firstAgent, buy);
        buyCount++;
    }

    public boolean delBuy() {
        Agent t = firstAgent;
        if (t != null) {
            firstAgent = firstAgent.getNextAgent();
            buyCount--;
        }
        return true;
    }

    public Agent findBuy(String aFam) {
        Agent currentAgent = firstAgent;
        while (currentAgent != null) {
            Buy buy = currentAgent.getBuy();
            if (buy != null) {
                if (buy.getFam().equals(aFam)) {
                    return currentAgent;
            } else {
                currentAgent = currentAgent.getNextAgent();
            }}
        }
        return null;
    }

    public String getAll() {
        Agent t = firstAgent;
        String text1 = "";
        while (t != null) {
            text1 = t.getBuy().getData() + text1;
            t = t.getNextAgent();
        }
        return text1;
    }

    public float srCena() {
        Agent t = firstAgent;
        float obchBal = 0;
        float srBal = 0;
        while (t != null) {
            obchBal = t.getNextAgent().getBuy().SredBall() + obchBal;
            t = t.getNextAgent();
            srBal = obchBal / buyCount;
        }
        return srBal;
    }

}
