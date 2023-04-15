package Enums;

public enum EnumPriority {
  LOW("LOW"),
  HIGH("HIGH");
  private String code;
  EnumPriority(String code) {
    this.code = code;
  }
}
