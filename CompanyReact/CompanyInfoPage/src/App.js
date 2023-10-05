import './App.css';
import CompanyList from './components/CompanyList';
import CreateCompany from './components/CreateCompany';
import Header from './components/Header';
import {BrowserRouter, Switch, Route} from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>   
      <div className='App'>
        <Header />
        <Switch>
          <Route exact path='/'>
            <CompanyList />
          </Route>
          <Route exact path='/createcompany'>
            <CreateCompany />
          </Route>
        </Switch>
        
      </div>
    </BrowserRouter>
  );
}

export default App;
