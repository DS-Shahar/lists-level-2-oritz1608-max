public static Node<Integer> L2EX3(Node<Integer> head, int x)  
  {
      Node<Integer> h = new Node<>(head.getValue(), head.getNext());
      boolean boo =true;
      int count =0;
      int fCount=0;
      while(boo==true)
      {
          if(h.getValue()==x)
          {
              boo =false;
          }
          else
          {
              count++;
              h=h.getNext();
          }
      }
      while(h.getValue()!=null)
      {
          h=h.getNext();
          fCount++;
          if(h.getValue==getNext)
          {
              fCount=0;
          }
      }
      return count+fCount;
  }
