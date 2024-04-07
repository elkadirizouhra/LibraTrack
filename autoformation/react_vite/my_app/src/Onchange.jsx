import { useState } from "react";
function Onchange(){
    const [name,setName]=useState("");
    const [quantity,setQ]=useState("");
    const [text,setText]=useState("");
    const [payement,setpayement]=useState("");
    const [shipping,setshipping]=useState("delivery");
   const handleevent=(e)=>{
    setName(e.target.value);
   }
    const handleevent2=(event)=>{
        setQ(event.target.value);
    }
    const handletext=(event)=>{
        setText(event.target.value);
    }
    const handlepayement=(event)=>{
        setpayement(event.target.value);
    }
    const handleshipping=(event)=>{
        setshipping(event.target.value)
    }
   return(
    <>
    <input value={name} onChange={handleevent} ></input>
    <p>name:{name}</p>
    <input value={quantity} onChange={handleevent2} type="number"></input>
    <p>quanity:{quantity}</p>
    <textarea value={text} onChange={handletext} placeholder="enter a text"></textarea>
    <p>text:{text}</p>
    <select value={payement} onChange={handlepayement} placeholder="enter a text">
    <option string="">select an option</option>
    <option string="barid">BARID card</option>
    <option string ="BMCE">bMCE card</option>
    </select>
    <p> you are choise {payement}</p>
    <label>
     <input type="radio" value="pick up" checked={shipping==="pick up"} onChange={handleshipping}></input>
     pick up
    </label><br></br>
    <label>
    <input type="radio" value="delivery" checked ={shipping==="delivery"} onChange={handleshipping}></input>
    delivery
    </label>
    <p> your shipping : {shipping}</p>
    
    </>
   )
}
export default Onchange