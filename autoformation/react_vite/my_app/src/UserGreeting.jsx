import prototype from 'prop-types'

function userGreting(props){


    return(
        <h3>{props.islogin ? `Welcome Mr${props.name}` :"you should to log in"}</h3>
    )

}
userGreting.defaultProps={
    islogin:false,
    name:"guest"
}
userGreting.prototype={
    name:prototype.string,
    islogin:prototype.bool
}
export default userGreting