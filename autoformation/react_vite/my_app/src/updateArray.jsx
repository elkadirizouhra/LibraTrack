import { useState } from "react";
export default function fruit(){
  const [fruit,setfruit]=useState(["orange","lime","strawberrry"]);

  function handleFood(){
    const food=document.getElementById("foodInput").value;
    setfruit([...fruit,food]);
  }
  function removefood(index){
     setfruit(fruit.filter((_,i)=>i!==index))
  }
 

  return(
    <div>
     <h2> Foods</h2>
     <ul>
        {fruit.map((fruit,index)=><li onClick={()=>removefood(index)}key={index} >{fruit}</li>)}
    
     </ul>
     
     <input type="text" id="foodInput" placeholder="enter a food" />
     <button onClick={handleFood}>Add food</button>
     
     
    
    </div>
    
       
    
   
    
    
  )
}