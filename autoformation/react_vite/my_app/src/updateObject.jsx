import { useState } from "react";
export default function Car(){
  const [car,setcar]=useState({name:"lambrghini",model:24,year:2024 });
  function handleName(event){
   setcar({...car, name:event.target.value});
  }
  const handleModel = (event) => {
    console.log("before updte", car.model)
    setcar(c => ({ ...c, model: parseInt(event.target.value)}));
  
};
  function  handleYear(event){
    console.log("before updte", car.year)
    setcar(car => ({ ...car, year: parseInt(event.target.value)}));
    
 
    
   
  }

  return(
    <>
    <p>Votre Car préferé c'est : 
      <li>
        name:{car.name}
      </li>
      <li>
        model:{car.model}
      </li>
      <li>
        year:{car.year}
      </li>
    </p>

    <input type="text" value={car.name} onChange={handleName}/>
    <input type="number" value={car.model} onChange={handleModel}/>
    <input type="number" value={car.year} onChange={handleYear}/>
   
    
    </>
  )
}