import { useState } from 'react';
import data from "../database/companyInfo.json"
import UseFetch from "./UseFetch";



const CompanyList=()=>{
    const companyList = UseFetch('http://localhost:3001/words');
    
       return(
        <div>
        <ul className='list_day'>{
            companyList.map((company)=>{
                return (
                    <li key={company.id}> 
                        <div className='list_company'>
                            <h2>[{company.name}] </h2>
                            <p> 채용 인원: {company.number} </p>
                            <p> 채용 직무: {company.job} </p>
                            <p> 지원 마감 기한: <br /> {company.date} </p>
                            <button onClick={()=>{
                                 if(window.confirm("삭제하시겠습니까?")){
                                    fetch('http://localhost:3001/words/'+company.id,{
                                        method:"DELETE",
                                    }).then((res)=>{
                                        if(res.ok){
                                            window.location.reload();
                                        }
                                    })
                                }
                            }} className="btn_del">삭제</button>
                            <button>수정</button>
                        </div>
                     </li>
                )
            })
        }</ul>
    </div>
       )
}



export default CompanyList;