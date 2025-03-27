package mobilestore;

 class Mobile {
    private String company;
    private String model;

    Mobile(String company,String model) {
        this.company = company;
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
