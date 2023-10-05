import './App.css';

import {Table} from 'react-bootstrap';
import {Container} from 'react-bootstrap';
import { useEffect, useState } from 'react';
import Company from './components/Company';
import 'bootstrap/dist/css/bootstrap.min.css'
import CompanyAdd from './components/CompanyAdd';


function App() {
  const [company, setCompany]=useState([]);
     //[]: 해당 컴포넌트가 처음 렌더링될때만 실행
  useEffect(()=>{
    fetch('http://localhost:3000/api/companyList',{
      headers:{
        'Accept': 'application/json'
      }
    })
    .then((res)=>{
      return res.json();
    })
    .then((res)=>{
      setCompany(res);
    })
    .catch((error)=>{
      console.log(error);
    })
  },[])

  return (
    <div className="container">
      <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <div className="container-fluid">
          <a className="navbar-brand" href="#">
            <img src="/img/logo.jpg" alt="" width="30" height="24" className="d-inline-block align-text-top" />
            채용 정보 사이트</a>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="#">Link</a>
              </li>
              <li className="nav-item dropdown">
                <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                  Dropdown
                </a>
                <ul className="dropdown-menu" aria-labelledby="navbarDropdown">
                  <li><a className="dropdown-item" href="#">Action</a></li>
                  <li><a className="dropdown-item" href="#">Another action</a></li>
                  <li><hr className="dropdown-divider" /></li>
                  <li><a className="dropdown-item" href="#">Something else here</a></li>
                </ul>
              </li>
              {/* <li className="nav-item">
                <a className="nav-link disabled">Disabled</a>
              </li> */}
            </ul>
           <CompanyAdd></CompanyAdd>
          </div>
        </div>
      </nav>

      <div id="carouselExampleCaptions" className="carousel slide" data-bs-ride="carousel">
        <div className="carousel-indicators">
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" className="active" aria-current="true" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
          <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div className="carousel-inner">
          <div className="carousel-item active">
            <img src="/img/banner3.jpg" className="d-block p-img" alt="..." />
              <div className="carousel-caption d-none d-md-block">
                <h5>First slide label</h5>
                <p>Some representative placeholder content for the first slide.</p>
              </div>
          </div>
          <div className="carousel-item">
            <img src="/img/banner2.jpg" className="d-block p-img" alt="..." />
              <div className="carousel-caption d-none d-md-block">
                <h5>Second slide label</h5>
                <p>Some representative placeholder content for the second slide.</p>
              </div>
          </div>
          <div className="carousel-item">
            <img src="/img/banner1.jpg" className="d-block p-img" alt="..." />
              <div className="carousel-caption d-none d-md-block">
                <h5>Third slide label</h5>
                <p>Some representative placeholder content for the third slide.</p>
              </div>
          </div>
        </div>
        <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
          <span className="carousel-control-prev-icon" aria-hidden="true"></span>
          <span className="visually-hidden">Previous</span>
        </button>
        <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
          <span className="carousel-control-next-icon" aria-hidden="true"></span>
          <span className="visually-hidden">Next</span>
        </button>
      </div>

    <div style={{
      display:'flex',
      justifyContent:'center',
      alignItems:'center'
    }}>
      <h2 style={{
        textAlign:'center',
        marginTop:'50px',
        borderBottom:'1px solid blue',
        width:'30%',
        height:'50px'
      }}>Company List</h2>
    </div>

    <div className='card_layout'>
      {
        company.map((company)=>{
          return(
            <Company key={company.id}
              id={company.id}
              image={company.image}
              name={company.name}
              date={company.date}
              number={company.number}
            ></Company>
          )
        })
      }
    </div>
          
    {/* <table className="table table-hover" style={{marginTop:'20px'}}>
      <thead>
        <tr>
          <th scope="col">id</th>
          <th scope="col">로고</th>
          <th scope="col">회사명</th>
          <th scope="col">기한</th>
          <th scope="col">채용인원</th>
          <th scope="col">수정/삭제</th>
        </tr>
      </thead>
      <tbody>
      {
        company.map((company) => {
          return (
            <Company key={company.id}
              id={company.id}
              image={company.image}
              name={company.name}
              date={company.date}
              number={company.number}
            ></Company>
          )
        })
      }
      </tbody>
    </table> */}
    </div>
  );
}

export default App;
