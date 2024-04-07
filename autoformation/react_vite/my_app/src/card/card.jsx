import './stylecard.css';

function Card() {
    return (
        <div className="container">
            <div className="image-container">
                <img src="https://aujourdhui.ma/wp-content/uploads/2016/02/900900834.jpg" alt="inpt" />
            </div>
            <div className="text-container">
                <h1>INPT</h1>
                <p>L'INPT est la seule grande école d'ingénieurs au Maroc offrant un cadre propice à des études supérieures très poussées dans le domaine du digital</p>
            </div>
        </div>
    );
}

export default Card;
