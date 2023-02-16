package com.microsoft.azure.msalwebsample;

public class Course {
    private String topic;
    private String description;
 
   public Course(String topic, String description) {
      super();
      this.topic = topic;
      this.description = description;
   }
 
   public String getTopic() {
      return topic;
   }
   public void setTopic(String topic) {
      this.topic = topic;
   }
   public String getDescription() {
      return description;
   }
   public void setDescription(String description) {
      this.description = description;
   }
}
