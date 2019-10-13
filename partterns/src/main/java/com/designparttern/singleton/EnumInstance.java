package com.designparttern.singleton;

//推荐的单例模式
public enum  EnumInstance {
   Instance{
     protected void print(){
       System.out.println("111");
     }
   };
   private Object data;
  protected abstract void print();

  public static EnumInstance getInstance() {
    return Instance;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
