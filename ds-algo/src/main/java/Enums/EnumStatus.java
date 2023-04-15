package Enums;

public enum EnumStatus {
  DONE("ON_GOING"),
  PENDING("PENDING"),
  ON_GOING("ON_GOING");
  private String code;
  EnumStatus(String code) {
    this.code = code;
  }
}
