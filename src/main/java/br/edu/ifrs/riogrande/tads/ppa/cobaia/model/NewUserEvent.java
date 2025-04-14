package br.edu.ifrs.riogrande.tads.ppa.cobaia.model;

import java.util.List;

public record NewUserEvent(
    String name,
    String handle,
    String email,
    String password,
    String company,
    br.edu.ifrs.riogrande.tads.ppa.cobaia.model.Profile.AccountType type,
    List<String> roles) {

}
