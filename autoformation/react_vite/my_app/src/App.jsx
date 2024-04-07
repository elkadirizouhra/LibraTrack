import Header from './header'
import Hello from './hello'
import Footer from './footer'
import Food from './food'
import Student from './Student'
import UserGreting from './UserGreeting'

function App() {
   return (
   <>
   <Header></Header>
    <Hello></Hello>
    <Food/>
    <Student name="zahira" age={22} isStudent={true}/>
    <Student name="safouane" age={23} isStudent={true}/>
    <Student name="khadija" age={49} isStudent={false}/>
    <Student/>
    <UserGreting islogin ={true} name="zahira"/>
    <Footer/>

   </>
    
  
    
   )
}

export default App
