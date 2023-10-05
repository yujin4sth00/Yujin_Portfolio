import { Card } from "react-bootstrap"
import CompanyDelete from "./CompanyDelete"
import CompanyModify from "./CompanyModify"


const Company=(props)=>{
    return(
        <>
            <Card style={{ width: '18rem'}} className="card_main">
                <Card.Body>
                    <div className="card_main_title">
                        <img src={props.image} width="30px" height="25px"></img>
                        <Card.Title>{props.name}</Card.Title>
                    </div>
                    <div className="card_main_sub">
                        <Card.Title>[채용 기한]</Card.Title>
                        <Card.Text>{props.date}</Card.Text>
                    </div>
                    <div className="card_main_sub">
                        <Card.Title>[채용 인원]</Card.Title>
                        <Card.Text>{props.number} 명</Card.Text>
                    </div>
                    <div className="card_main_button">
                        <CompanyModify id={props.id} name={props.name} date={props.date} number={props.number}></CompanyModify>
                        <span style={{margin:'0 5px'}}></span>
                        <CompanyDelete id={props.id}></CompanyDelete>
                    </div>
                </Card.Body>
            </Card>
           {/* <tr>
            <td>{props.id}</td>
            <td><img src={props.image} width="30px" height="30px" /></td>
            <td>{props.name}</td>
            <td>{props.date}</td>
            <td>{props.number}</td>
            <td>
                <CompanyModify id={props.id} name={props.name} date={props.date} number={props.number} />
                <span style={{margin:'5px'}}></span>
                <CompanyDelete id={props.id} /></td>
           </tr> */}
        </>
    )
}



const CompanyProfile=(props)=>{
    return(
        <div>
            <img src={props.image} width="30px" height="30px"></img>
            <h2>{props.name} (id : {props.id})</h2>
        </div>
    )
}

const CompanyInfo=(props)=>{
    return(
        <div>
            <p>{props.date}</p>
            <p>{props.number}</p>
        </div>
    )
}

export default Company;