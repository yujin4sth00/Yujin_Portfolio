import Button from "react-bootstrap/esm/Button";

const CompanyDelete=(props)=>{

    const deleteCompany=(id)=>{
        console.log('deleteCompany()-> ');
        const url='http://localhost:3000/api/companyDelete';

        fetch(url,{
            method:'post',
            headers:{
                'Content-type':'application/json'
            },
            body:JSON.stringify({
                id:id
            })
        }).then((res)=>{
            if(res.ok){
                alert('해당 내용을 삭제하였습니다!');
                //삭제된 내용 확인
                window.location.reload();
            }
        });
    }

    return(
        <Button variant="outline-danger" onClick={()=>{
            deleteCompany(props.id);
        }}>
        삭제
      </Button>
    )
}

export default CompanyDelete;