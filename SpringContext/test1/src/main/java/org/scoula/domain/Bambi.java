package org.scoula.domain;

import org.springframework.stereotype.Component;

@Component("밤비")
public class Bambi extends Dog{
   private String name = "밤비";
   private String breed = "시바견";



   @Override
   public String toString() {
      return "[Dog] 이름: "+name+", 견종: "+breed;
   }
}
