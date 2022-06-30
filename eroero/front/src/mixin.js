import axios from "axios"

export default{
    methods: {
        async $api(url, data, method){
            return (await axios({
                url,
                data,
                method
            }))
        }
    }

}


