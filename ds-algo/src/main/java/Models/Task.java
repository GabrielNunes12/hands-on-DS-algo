package Models;

import Enums.EnumPriority;
import Enums.EnumStatus;

import java.time.Instant;

public class Task {
  private Long id;
  private String title;
  private String description;
  private Instant dueDate;
  private EnumPriority enumPriority;
  private EnumStatus enumStatus;

  public Task() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Instant getDueDate() {
    return dueDate;
  }

  public void setDueDate(Instant dueDate) {
    this.dueDate = dueDate;
  }

  public EnumPriority getEnumPriority() {
    return enumPriority;
  }

  public void setEnumPriority(EnumPriority enumPriority) {
    this.enumPriority = enumPriority;
  }

  public EnumStatus getEnumStatus() {
    return enumStatus;
  }

  public void setEnumStatus(EnumStatus enumStatus) {
    this.enumStatus = enumStatus;
  }

  public Task(Long id, String title, String description, Instant dueDate, EnumPriority enumPriority, EnumStatus enumStatus) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.dueDate = dueDate;
    this.enumPriority = enumPriority;
    this.enumStatus = enumStatus;
  }

  public static class Builder {
    private Long id;
    private String title;
    private String description;
    private Instant dueDate;
    private EnumPriority enumPriority;
    private EnumStatus enumStatus;

    public Builder(Long id, String title, String description,
                   Instant dueDate, EnumPriority enumPriority, EnumStatus enumStatus) {
      this.id = id;
      this.title = title;
      this.description = description;
      this.dueDate = dueDate;
      this.enumPriority = enumPriority;
      this.enumStatus = enumStatus;
    }

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder title(String title) {
      this.title = title;
      return this;
    }


    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder dueDate(Instant dueDate) {
      this.dueDate = dueDate;
      return this;
    }

    public Builder enumPriority(EnumPriority enumPriority) {
      this.enumPriority = EnumPriority.valueOf(String.valueOf(enumPriority));
      return this;
    }

    public Builder enumStatus(EnumStatus enumStatus) {
      this.enumStatus = EnumStatus.valueOf(String.valueOf(enumStatus));
      return this;
    }
    public Task build() {
      return new Task(id, title, description, dueDate, enumPriority, enumStatus);
    }
  }
}
