package com.dwiauliaanugerah_202102359.forex;

import com.google.gson.annotations.SerializedName;

public class RootModel
{
    @SerializedName("rates")
    private RatesModel ratesModel;

    public RootModel() {}

    public RatesModel getRatesModel() {return ratesModel; }

    public void setRatesModel(RatesModel ratesModel) {this.ratesModel = ratesModel; }
}
