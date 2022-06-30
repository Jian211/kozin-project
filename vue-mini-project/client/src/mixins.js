// axios를 공통모듈로 만듬
import axios from 'axios';

export default{
    methods: {
        async $api(url, data){
            return (await axios({
                url, 
                data, 
                method : 'get'
            }).catch(e => {
                console.log(e);
            })).data;
        }
    }
}