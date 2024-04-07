import { useState } from "react";
function Cars(){
    const [cars,setCars]=useState([]);
    const [year,setYear]=useState(new Date().getFullYear());
    const [make,setmake]=useState("")
    const [model,setmodel]=useState("")
    function Addcar(){
        const newCar={
            yearCar:year,
            makeCar:make,
            modelCar:model
        }
          setCars(cars=>[...cars,newCar])
        setYear(new Date().getFullYear());
        setmake("");
        setmodel("");
    }
    function removeCar(index){
        setCars(c=>c.filter((_,i)=>i!==index));
    }
    function handleYear(event){
         setYear(event.target.value)
    }
    function handleModel(event){
        setmodel(event.target.value);
    }
    function handleMake(event){
        setmake(event.target.value)
    }
    return(

        <>
        <h2>
            List of Cars
        </h2>
        <ul>
            {cars.map((car,index)=><li key={index} onClick={()=>removeCar(index)}>{car.yearCar}  {car.makeCar}  {car.modelCar} </li>)}
        </ul>
        <input type="number" value={year} placeholder="enter year" onChange={handleYear}></input>
        <input type="text" value={make} placeholder="enter a car make" onChange={handleMake}></input>
        <input type="text" value={model} placeholder="entera a car model" onChange={handleModel}></input>

        <button onClick={Addcar}>Add a car</button>
        </>
    )
}
export default Cars