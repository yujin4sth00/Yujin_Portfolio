
import { useState } from "react";
import { post } from "axios";
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";
import Form from "react-bootstrap/Form";
const CompanyModify=(props)=>{
    //상태변수 선언
    const [companyname, setCompanyname]=useState(props.name);
    const [date, setDate]=useState(props.date);
    const [number, setNumber]=useState(props.number);
    const [file, setFile]=useState(null);

    const modifyCompany = () => {
        console.log("modifyCompany()-> ");
        const url = "http://localhost:3000/api/companymodify";
        const formData = new FormData();
    
        formData.append("filename", file.name);
        formData.append("file", file);
        formData.append("companyname",companyname);
        formData.append("date",date);
        formData.append("number", number);
        formData.append("id", props.id);
    
        const config = {
          Headers: {
            "content-type": "multipart/form-data",
          },
        };
        //url로 formdata를 전송
        return post(url, formData, config);
      };
    const handleSubmit=(e)=>{
        e.preventDefault();
        modifyCompany();
        window.location.reload();
    }
    const [show, setShow] = useState(false);
    const handleClose = () => setShow(false);
    const handleShow = () => setShow(true);
    return (
      <>
        <Button variant="outline-primary" onClick={handleShow}>
          수정
        </Button>

        <Modal show={show} onHide={handleClose}>
          <Form onSubmit={handleSubmit}>
            <Modal.Header closeButton>
              <Modal.Title>회사 정보(수정)</Modal.Title>
            </Modal.Header>

            <Modal.Body>
              <Form.Group controlId="formFile" className="mb-3">
                <Form.Label>File Upload</Form.Label>
                <Form.Control
                  type="file"
                  name="file"
                  onChange={(e) => {
                    return setFile(e.target.files[0]);
                  }}
                />
              </Form.Group>

              <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>회사명</Form.Label>
                <Form.Control
                  type="text"
                  name="companyname"
                  value={companyname}
                  onChange={(e)=>{
                    setCompanyname(e.target.value);
                  }}
                />
              </Form.Group>

              <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>기한</Form.Label>
                <Form.Control
                  type="date"
                  name="date"
                  value={date}
                  onChange={(e)=>{
                    setDate(e.target.value);
                  }}
                />
              </Form.Group>

              <Form.Group className="mb-3" controlId="formBasicEmail">
                <Form.Label>채용 인원</Form.Label>
                <Form.Control
                  type="text"
                  name="number"
                  value={number}
                  onChange={(e)=>{
                    setNumber(e.target.value);
                  }}
                />
              </Form.Group>
            </Modal.Body>

            <Modal.Footer>
              <Button type="submit" variant="primary" onClick={handleClose}>
                저장
              </Button>
              <Button variant="secondary" onClick={handleClose}>
                닫기
              </Button>
            </Modal.Footer>
          </Form>
        </Modal>
      </>
    );
}

export default CompanyModify;